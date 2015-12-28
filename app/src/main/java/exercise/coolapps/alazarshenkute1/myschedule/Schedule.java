package exercise.coolapps.alazarshenkute1.myschedule;

public class Schedule {

        private String day;         // thursday
        private String startShift;  // 9:00am
        private String endShift;    // 5:30pm
        private String date;        //
        private String location;    // 17th & Broadway

        public Schedule()
        {

        }
        public Schedule( String day, String startShift, String endShift, String date )
        {
            this.day = day;
            this.startShift = startShift;
            this.endShift = endShift;
            this.date = date;
        }
         public String getLocation() {
            return location;
         }

        public void setLocation(String location) {
            this.location = location;
        }
        public void setDay( String day ){
            this.day = day;
        }
        public String getDay(){
            return day;
        }
        public void setStartShift( String startShift ){
            this.startShift = startShift;
        }
        public String getStartShift(){
            return startShift;
        }
        public void setEndShift( String endShift ){
            this.endShift = endShift;
        }
        public String getEndShift(){
            return endShift;
        }
        public void setDate( String date ){
            this.date = date;
        }
        public String getDate(){
            return date;
        }


}
