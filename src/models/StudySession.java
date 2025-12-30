package models;

import java.time.LocalDate;

public class StudySession {
    private int sessionId;
    private int userId;
    private LocalDate sessionDate;
    private int durationMinutes;

    public StudySession() {}

    public StudySession(int sessionId, int userId, LocalDate sessionDate, int durationMinutes) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.sessionDate = sessionDate;
        this.durationMinutes = durationMinutes;
    }

    public int getSessionId() { return sessionId; }
    public void setSessionId(int sessionId) { this.sessionId = sessionId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public LocalDate getSessionDate() { return sessionDate; }
    public void setSessionDate(LocalDate sessionDate) { this.sessionDate = sessionDate; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    @Override
    public String toString() {
        return "StudySession{" +
                "sessionId=" + sessionId +
                ", sessionDate=" + sessionDate +
                ", duration=" + durationMinutes +
                '}';
    }
}
