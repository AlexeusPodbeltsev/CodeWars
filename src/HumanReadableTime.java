public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int readableHours = seconds / 3600;
        int readableMinutes = (seconds % 3600) / 60;
        int readableSeconds = (seconds % 3600) % 60;
        return String.format("%02d:%02d:%02d", readableHours, readableMinutes, readableSeconds);
    }
}
