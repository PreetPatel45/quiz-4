public class Task {
    static String assignee=null;
    static int status=0;
    static String dueDate=null;

    public static void setAssignee(String assignee) {
        assignee = assignee;
    }

    public static void updateStatus(int status) {
        status = status;
    }

    public static String getAssignee() {
        return assignee;
    }
    public static int getStatus() {
        return status;
    }
    public static void setDuedate(String Date) {
        dueDate = Date;
    }

    public static boolean isDue(String endDate) {
        if(endDate.equals(dueDate)) {
            return true;
        }
        else{
            return false;
        }
    }


}
