public class LeetCode5183 {
	
	public String dayOfTheWeek(int day, int month, int year){
		String[] week ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		String dayStr = ""+year+"-"+month+"-"+day;
		
		java.util.Calendar cal = java.util.Calendar.getInstance(); 
		try {
			cal.setTime(format.parse(dayStr));
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
	       
	    int weekday = cal.get(java.util.Calendar.DAY_OF_WEEK)-1; 
	    return week[weekday];
	}

}
