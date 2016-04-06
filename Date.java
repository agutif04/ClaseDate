class Date{
   
    public Date(){
    public int day;
    private int month;
    private int year;
    }
	public Date(int day;int month; int year)throws DateException()
    	stringBuffer= new stringBuffer()
    boolean isSameYear(Date otherDate){
	if(this.year==otherYear.getYear){
	    return true;
	}else{
	    return false;
	}
	}
    boolean isSameMonth(Date otherDate){
	    if(this.month==otherMonth.getMonth){
		return true;
	    }else{
		return false;
	    }
	    }
    boolean isSameDay(Date otherDate){
	if(this.Day==otherDay.getDay){
	    return true;
	}else {
	    return false;
	}
    }
	
	int getDay(){
	    return this.day;
	}
	void setDay(int day){
	     this.day=day;
	}
	void setMonth(int month){
		this.month=month;
	    }
	void setYear(int year){
		this.year=year; 
	    }
}
