package hw10;

import java.util.Objects;

public class FileData {
    private String fileName;
    private int fileSize;
    private String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileData fileData)) return false;

        if (getFileSize() != fileData.getFileSize()) return false;
        if (!getFileName().equals(fileData.getFileName())) return false;
        return getFilePath().equals(fileData.getFilePath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, filePath);
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", filePath='" + filePath + '\'' +
                '}';
    }

}
