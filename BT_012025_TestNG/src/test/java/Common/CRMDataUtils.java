package Common;

public class CRMDataUtils {
    public static int getTotalAfterAdd(int element) {
        int total;
        total = element + 1;
        return total;
    }

    public static int getTotalAfterDelete(int element) {
        int total;
        total = element - 1;
        return total;
    }
}
