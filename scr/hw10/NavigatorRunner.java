package hw10;

public class NavigatorRunner {
    public static void main(String[] args) {
        FileData testFile1 = new FileData("aaa", 115, "/dir1/dir2/");
        FileData testFile2 = new FileData("bbb", 145, "/dir2/dir3/");
        FileData testFile3 = new FileData("ccc", 130, "/dir2/dir1/");
        FileData testFile4 = new FileData("ddd", 135, "/dir3/dir1/");
        FileData testFile5 = new FileData("eee", 185, "/dir1/dir2/");
        FileData testFile6 = new FileData("fff", 175, "/dir3/dir1/");
        FileData testFile7 = new FileData("ggg", 115, "/dir2/dir1/");
        FileData testFile8 = new FileData("jjj", 135, "/dir1/dir4/");



        FileNavigator fileStorage = new FileNavigator();

        fileStorage.add("/dir1/dir2/", testFile1);
        fileStorage.add("/dir2/dir3/", testFile2);
        fileStorage.add("/dir2/dir1/", testFile3);
        fileStorage.add("/dir3/dir1/", testFile5);
        fileStorage.add("/dir1/dir2/", testFile4);
        fileStorage.add("/dir3/dir1/", testFile6);
        fileStorage.add("/dir2/dir1/", testFile7);
        fileStorage.add("/dir1/dir4/", testFile8);

        System.out.println(fileStorage);
        System.out.println(fileStorage.find("/dir2/dir1/"));
        System.out.println(fileStorage.find("/dir9/dir1/"));
        System.out.println(fileStorage.filterBySize(155));
        System.out.println(fileStorage.filterBySize(130));
        System.out.println(fileStorage.sortBySize());
        System.out.println(fileStorage.remove("qwerty"));
        System.out.println(fileStorage.remove("/dir4/dir1/"));
        System.out.println(fileStorage);
    }
}
