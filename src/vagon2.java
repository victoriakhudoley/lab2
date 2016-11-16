/**
 * Created by lin-k on 13.11.2016.
 */
public class vagon2 extends vagon {

    public void IzmenitxChisloMest(int NovoeChisloMest) {
        this.ChisloMest = NovoeChisloMest;
    }

    @Override
    public void ZanyatxMesto(int NomerMesta) {
        if(MestoZanyato(NomerMesta) == 1) {
            System.out.println(String.format("%d place in wagon %d is reserved!", NomerMesta, NomerEtogoVagona));
            return;
        }
        super.ZanyatxMesto(NomerMesta);
    }

    @Override
    public void VagonInfo() {
        System.out.print("Vagon №");
        System.out.println(this.NomerEtogoVagona);
        System.out.println("Mesta: ");
        int count = 0;
        for (int i = 1; i <= ChisloMest; i++) {
            if (MestoZanyato(i) == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.println(String.format("Number of free places: %d", count));
    }
}
