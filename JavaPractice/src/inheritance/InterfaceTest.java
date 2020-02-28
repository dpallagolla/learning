package inheritance;

public class InterfaceTest {
    interface Gift  { void present(); }
    interface Guest { void present(); void somethinElse();}

    interface Presentable extends Gift, Guest { }

    public static void main(String[] args) {
        Presentable johnny = new Presentable() {
            @Override public void present() {
                System.out.println("Heeeereee's Johnny!!!");
            }

			@Override
			public void somethinElse() {
				// TODO Auto-generated method stub
				
				try {
					System.out.println("s");
				} catch(Exception e) {
					
				}
				
			}
        };
        johnny.present();                     // "Heeeereee's Johnny!!!"

        
        
        ((Gift) johnny).present();            // "Heeeereee's Johnny!!!"
        ((Guest) johnny).present();           // "Heeeereee's Johnny!!!"

        ((Guest) johnny).somethinElse();
        
        
        Gift johnnyAsGift = (Gift) johnny;
        johnnyAsGift.present();               // "Heeeereee's Johnny!!!"

        Guest johnnyAsGuest = (Guest) johnny;
        johnnyAsGuest.present();              // "Heeeereee's Johnny!!!"
    }
}