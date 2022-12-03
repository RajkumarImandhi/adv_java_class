package Assignment;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data1 {
	String mveName;
	String studioName;
	String rating;
	String theatreCount;
	Double openingDayEarning;
	
	public Double getOpeningDayEarning() {
		return openingDayEarning;
	}
	public void setOpeningDayEarning(Double openingDayEarning) {
		this.openingDayEarning = openingDayEarning;
	}
	public String getTheatreCount() {
		return theatreCount;
	}
	public void setTheatreCount(String theatreCount) {
		this.theatreCount = theatreCount;
	}

	public String getMveName() {
		return mveName;
	}
	public void setMveName(String mveName) {
		this.mveName = mveName;
	}
	public String getStudioName() {
		return studioName;
	}
	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
public class extra2 {

	public static void main(String[] args) throws Exception {
		
		Stream<String> lines = Files.lines(Paths.get(args[0]).toAbsolutePath()).skip(1);

		List<Data1> movies = lines.map(s -> {
			String[] strings = s.split(",");
			Data1 obj = new Data1();
			
			obj.setMveName(strings[1]);
			obj.setStudioName(strings[2]);
			obj.setTheatreCount(strings[4]);
			obj.setOpeningDayEarning(Double.parseDouble(strings[5]));
			obj.setRating(strings[7]);
			return obj;
		}).collect(Collectors.toList());
		
		Comparator<Data1> theatre_cmp = new Comparator<Data1>() {
			public int compare(Data1 t1, Data1 t2) {
				int theatreCntCmp = Integer.parseInt(t1.getTheatreCount()) > Integer.parseInt(t2.getTheatreCount()) ? 1 : -1;

				return theatreCntCmp;
			}
		};
		
		// 1) Total Movies Count
		long mvesCount = movies.size();
		System.out.println("Total Movies Count = "+mvesCount);
		
		System.out.println("\n");
		

		// 2) Total Number of Theatres for Sony
		long sonyTheatresCount = movies.stream().filter(x -> x.getStudioName().equals("Sony"))
						.map(x -> Integer.parseInt(x.getTheatreCount()))
						.reduce(0, (x,y) -> x + y);
		
		System.out.println("Total Sony Theatres Count = " +sonyTheatresCount);
		
		System.out.println("\n");	

		
		// 3)  Top 10 number of theaters in descending order – show the movie name and the number of theaters
		List<Data1> top10list = movies.stream().sorted(theatre_cmp.reversed()).limit(10).collect(Collectors.toList());
						
		top10list.forEach(x -> System.out.println(x.getMveName()+ " : "+x.getTheatreCount()));

		System.out.println("\n");
		
		
		// 4)  Rating counts for PG-13, R, G, and PG – excluding N/A
		Map<Object, Long> rating = movies.stream().filter(x -> !x.getRating().equals("N/A")).collect(Collectors.groupingBy(
				x -> x.getRating(),
				Collectors.counting()));
		rating.forEach((ratingName, ratingCount) -> System.out.println(ratingName + " : " + ratingCount));
		
		System.out.println("\n");
		
		// 5) Average earning for PG-13, R, G, and PG – excluding N/A
		Map<Object, Double> averagegEarning = movies.stream().filter(x -> !x.getRating().equals("N/A"))
						.collect(Collectors.groupingBy(
								x -> x.getRating(),
								Collectors.averagingDouble(y -> y.getOpeningDayEarning())
								));
	
		averagegEarning.forEach((ratingName, ratingAvg) -> System.out.println(ratingName +" : "+ratingAvg));
		
		System.out.println("\n");	
		

	}
}
