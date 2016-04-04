class Date{
    private int day;
    private int month;
    private int year;
    boolean isSameYear(Date otherDate){
	if(this.year==otherYear){
	    return true;
	}else{
	    return false;
	}
	int getDay(){
	    return this.day;
	}
	void setDay(int day){
	     this.day=day;
	}
