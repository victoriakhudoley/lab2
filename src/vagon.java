public class vagon {

    protected int ChisloMest = 36;
    private int[] Mesta;
    public int NomerEtogoVagona;

    public void PustojVagon(int NomerVagona) {
        NomerEtogoVagona = NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i = 0; i < ChisloMest; i++)
            Mesta[i] = 0;
    }

    public int MestoZanyato(int NomerMesta) {
        return Mesta[NomerMesta - 1];
    }

    public void ZanyatxMesto(int NomerMesta) {
        Mesta[NomerMesta - 1] = 1;
    }

    public void VagonInfo() {
        System.out.println("mesta: ");
        for (int i = 0; i < ChisloMest; i++)
            if (Mesta[i] == 0) System.out.print((i + 1) + " ");
        System.out.println("");
    }

}
