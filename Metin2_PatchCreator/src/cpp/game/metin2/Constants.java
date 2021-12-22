package cpp.game.metin2;

public class Constants
{
    public static final int patchGameVersion = 1; // version to package the game files as
    public static final int patchLauncherVersion = 101; // version to package the launcher as
    public static final int numUpdateServers = 1; // number of update servers

    public static final String baseDirectory = "C:\\Users\\iMerv3\\Metin2\\7. Autopatcher"; // working directory
    public static final String gameDirectory = baseDirectory + "\\client"; // the game files directory name in the working directory that the patch will be created of
    public static final String uploadDirectory = baseDirectory + "\\upload"; // the directory where the created patch files that need uploading go
    public static final String[] excludedFiles = {}; // files to exclude from the game files directory
}
