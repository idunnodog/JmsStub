package com.radiabeam.stub.config.Model;

public class PublisherParam {
    private String threads;
    private String sessions;

    @Override
    public String toString() {
        return "PublisherParam{" +
                "threads='" + threads + '\'' +
                ", sessions='" + sessions + '\'' +
                '}';
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    public String getSessions() {
        return sessions;
    }

    public void setSessions(String sessions) {
        this.sessions = sessions;
    }
}
