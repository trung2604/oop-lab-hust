package sourceCode;
public class Cart {
	//Do Dinh Trung 20226128
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() +" has been added.");
        } else {
            System.out.println("DoDinhTrung-20226128-The cart is full! Cannot add more discs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--; 
                System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DoDinhTrung-20226128-Disc not found in cart.");
    }

    public float totalCost(){
        float result = 0;
        for(int i = 0; i < qtyOrdered; i++){
            result += itemsOrdered[i].getCost();
        }
        return result;
    }
}
