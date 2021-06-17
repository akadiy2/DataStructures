package LinkedLists;

public class Disk {


    public static void main(String[] args) {
        String [] disk;
        FileNode fileNode = new FileNode();
        fileNode.fileName = "file1";
        fileNode.nbrCharacters = 50;
        fileNode.next = null;

        Sector sector = new Sector();
        sector.rangeAvailable1 = 5;
        sector.rangeAvailable2 = 10;
        sector.next = null;
        fileNode.sectors = sector;

        disk = new String[fileNode.getNumOfSectors() * fileNode.sizeOfSectorsInFile()];
        System.out.println(fileNode.getNumOfSectors());
        System.out.println(fileNode.sizeOfSectorsInFile());
        save(fileNode, disk);


    }

    private static void save(FileNode fileNode, String [] disk) {
        System.out.println(disk.length);

    }
}
