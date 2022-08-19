package utils.versionControl;

public class VersionControl {
     static boolean[] versions;

     public VersionControl(int size, int badIndex) {
          versions = new boolean[size];
          for (int i = 0; i < size; i++) {
               versions[i] = i >= badIndex;
          }
     }

     public static boolean isBadVersion(int version){
          return versions[version];
     }
}
