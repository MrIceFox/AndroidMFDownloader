package com.mricefox.mfdownloader.lib;

/**
 * Author:zengzifeng email:zeng163mail@163.com
 * Description:
 * Date:2015/11/23
 */
public class Download {
    public static final int STATUS_PENDING = 1 << 1;
    public static final int STATUS_RUNNING = 1 << 2;
    public static final int STATUS_PAUSED = 1 << 3;
    public static final int STATUS_SUCCESSFUL = 1 << 4;
    public static final int STATUS_FAILED = 1 << 5;
    private String uri;
    private String targetFilePath;
    transient private DownloadingListener downloadingListener;

    public Download(String uri, String targetFilePath) {
        this.uri = uri;
        this.targetFilePath = targetFilePath;
    }

    public Download(String uri, String targetFilePath, DownloadingListener listener) {
        this.uri = uri;
        this.targetFilePath = targetFilePath;
        downloadingListener = listener;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTargetFilePath() {
        return targetFilePath;
    }

    public void setTargetFilePath(String targetFilePath) {
        this.targetFilePath = targetFilePath;
    }

    public DownloadingListener getDownloadingListener() {
        return downloadingListener;
    }

    public void setDownloadingListener(DownloadingListener downloadingListener) {
        this.downloadingListener = downloadingListener;
    }

    @Override
    public boolean equals(Object o) {
//        return super.equals(o);
        if (o instanceof Download) {
            return ((Download) o).uri.equals(uri) && ((Download) o).targetFilePath.equals(targetFilePath);
        }
        return false;
    }
}
