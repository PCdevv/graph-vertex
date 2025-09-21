public class Graph {
    private final int MAX_VERTS = 20;
    private final int INFINITY = 0;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;

        // inisialisasi matriks dengan 0
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = INFINITY;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight; // berarah
    }

    // daftar tetangga seperti contoh 1
    public void daftarTetangga() {
        System.out.println("Jarak Antar Vertex");
        for (int i = 0; i < nVerts; i++) {
            System.out.println("Vertex " + vertexList[i].label);
            for (int j = 0; j < nVerts; j++) {
                if (i == j) {
                    System.out.println("Vertex " + vertexList[i].label +
                            " tidak bertetangga dengan " + vertexList[j].label);
                } else if (adjMat[i][j] != INFINITY) {
                    System.out.println("Vertex " + vertexList[i].label +
                            " bertetangga dengan " + vertexList[j].label +
                            " dengan jarak = " + adjMat[i][j]);
                } else {
                    System.out.println("Vertex " + vertexList[i].label +
                            " tidak bertetangga dengan " + vertexList[j].label);
                }
            }
            System.out.println();
        }
    }

    // adjacency table 0/1 seperti contoh 2
    public void adjancyTable() {
        System.out.print("    ");
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + "   ");
        }
        System.out.println();

        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + "   ");
            for (int j = 0; j < nVerts; j++) {
                int val = (adjMat[i][j] != INFINITY) ? 1 : 0;
                System.out.print(val + "   ");
            }
            System.out.println();
        }
    }

    // jumlah vertex
    public void jumlahVertex() {
        System.out.println("Jumlah vertex dalam graph = " + nVerts);
    }

    // tabel jarak antar vertex
    public void tabelJarak() {
        System.out.print("    ");
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + "   ");
        }
        System.out.println();

        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + "   ");
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
