interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double avg);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double avg) {
        if (avg >= 60)
            return "First Division";
        else
            return "Second Division";
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Passed: " + r.isPassed(50));
        System.out.println("Division: " + r.getDivision(65));
    }
}
