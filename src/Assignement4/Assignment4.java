package Assignement4;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Data{
	String mvname, rating;
	String studioname;
	String theatreCount;
	Double openingDayCollection;


	public Double getTotalCollection() {
		return openingDayCollection;
	}

	public void setTotalCollection(Double openingDayCollection) {
		this.openingDayCollection = openingDayCollection;
	}

	
	public String getStudioname() {
		return studioname;
	}

	public void setStudioname(String studioname) {
		this.studioname = studioname;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	String theater;
	public String getmvName() {
		return mvname;
	}

	public void setmvName(String mvname) {
		this.mvname = mvname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setOpeningDayEarning(double parseDouble) {
		// TODO Auto-generated method stub
		
	}

}

public class Assignment4 {

	public static void main(String[] args) throws Exception{
		Stream<String> lines = Files.lines(Paths.get(args[0]).toAbsolutePath() 
				).skip(1);
		
		List<Data> movies = lines.map(str -> {
			return extracted(str);
		}).collect(Collectors.toList());
		
		Comparator<Data> theatre_cmp = new Comparator<Data>() {
			public int compare(Data d1, Data d2) {
				int theatreCmp = Integer.parseInt(d1.getTheater()) > Integer.parseInt(d2.getTheater()) ? 1 : -1;

				return theatreCmp;
			}
		};

		System.out.println("1. Total numbers of movies = " + movies.size());
		
		System.out.println("-------------------------");
		
		
		System.out.println("2. Total Sony Theatres Count = " + 
		movies.stream().filter(x -> x.getStudioname().equals("Sony"))
				.map(x -> Integer.parseInt(x.getTheater()))
				.reduce(0, (x,y) -> x + y));

		System.out.println("-------------------------");
		System.out.println("Top 10 number of theaters in descending order – show the movie name and the number of theaters :\n");
		List<Data> top10list = movies.stream().sorted(theatre_cmp.reversed()).limit(10).collect(Collectors.toList());
		
		top10list.forEach(x -> System.out.println(x.getmvName()+ " : "+x.getTheater()));
		
		System.out.println("-------------------------");
		
		Map<Object, Long> rating = movies.stream().filter(x -> !x.getRating().equals("N/A")).collect(Collectors.groupingBy(
				x -> x.getRating(),
				Collectors.counting()));
		System.out.println("Rating counts for PG-13, R, G, and PG – excluding N/A :\n");
		rating.forEach((ratingName, ratingCount) -> System.out.println(ratingName + " : " + ratingCount));
		
		System.out.println("-------------------------");
		
		Map<Object, Double> averagegEarning = movies.stream().filter(x -> !x.getRating().equals("N/A"))
				.collect(Collectors.groupingBy(
						x -> x.getRating(),
						Collectors.averagingDouble(y -> y.getTotalCollection())
						));
		System.out.println("Average earning for PG-13, R, G, and PG – excluding N/A :\n");
		averagegEarning.forEach((ratingName, ratingAvg) -> System.out.println(ratingName +" : "+ratingAvg));

		
	}

	private static Data extracted(String str) {
		String[] strings = str.split(",");
		Data data = new Data();
		
		
		data.setmvName(strings[1]);
		data.setStudioname(strings[2]);
		data.setTheater(strings[4]);
		data.setTotalCollection(Double.parseDouble(strings[3]));
		data.setRating(strings[7]);
		
		return data;
	}

}

