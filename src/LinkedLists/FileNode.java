package LinkedLists;

public class FileNode {
    String fileName;
    int nbrCharacters;
    Sector sectors;
    FileNode next;

    public FileNode(String fileName, int nbrCharacters, Sector sectors, FileNode next) {
        this.fileName = fileName;
        this.nbrCharacters = nbrCharacters;
        this.sectors = sectors;
        this.next = next;
    }

    public FileNode() {

    }

    public int sizeOfSectorsInFile() {
        Sector current = this.sectors;
        //int counter = 0;
        int sizeOfSector = 0;
        while (current != null) {

            sizeOfSector += current.rangeAvailable1 + current.rangeAvailable2;
            current = current.next;
            //counter++;
        }

        return sizeOfSector;
    }

    public int getNumOfSectors() {
        Sector current = this.sectors;
        int counter = 0;
        while (current != null) {
            current = current.next;

            counter++;
        }

        int numOfSectors = counter;
        if (numOfSectors == 0) {
            numOfSectors = 1;
        }

        return numOfSectors;
    }





}
