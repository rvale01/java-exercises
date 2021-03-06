import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the size of the arrays: ");
        int size = scn.nextInt();
        MountainBikes[] mountainBikes = new MountainBikes[size];
        RacerBikes[] racerBikes = new RacerBikes[size];

        boolean b = false; 

        do{
            System.out.println("1. Add MB  ");
            System.out.println("2. Add RB  ");
            System.out.println("3. Display (using to string method)  ");
            System.out.println("4. Display (using to standard array traversal and getting object details) ");
            System.out.println("5. Edit MB");
            System.out.println("6. Edit RB");
            System.out.println("7. Search");
            System.out.println("8. Apply break ");
            System.out.println("9. Speed up");
            System.out.println("10. Exit");

            int option = scn.nextInt();

            switch(option){
                case 1: mountainBikes = addMB(mountainBikes);break;
                case 2: racerBikes = addRB(racerBikes);break;
                case 3: display(racerBikes, mountainBikes);break;
                case 4: display2(racerBikes, mountainBikes);break;
                case 5: mountainBikes=editMB(mountainBikes);break;
                case 6: racerBikes = editRB(racerBikes);break;
                case 7: {
                    int pos = search(mountainBikes,racerBikes);
                };break;
                case 8:callApplyBrakes(mountainBikes, racerBikes);break;
                case 9:callSpeedUp(mountainBikes, racerBikes);break;
                case 10: b = true;
            }
        }while(b == false);
    }

    public static MountainBikes[] addMB(MountainBikes[] mountainBikes){
        Scanner scn = new Scanner(System.in);
        for(int x = 0; x<mountainBikes.length; x++){
            System.out.println("Add new Mountain Bikes");
            MountainBikes mb = new MountainBikes();

            System.out.println("Gear: ");
            mb.setGear(scn.nextInt());

            System.out.println("Speed: ");
            mb.setSpeed(scn.nextDouble());

            System.out.println("Seat Height: ");
            mb.setSeatHeight(scn.nextDouble());

            boolean b = true;
            int frame;
            do{
                System.out.println("FrameNumber: ");
                frame = scn.nextInt();
                b = true; 

                for(int y= 0; y< x; y++){
                    MountainBikes mb2 = new MountainBikes();
                    mb2 = (MountainBikes)mountainBikes[y];
                    if (frame == mb2.getFrameNumber()){
                        System.out.println("The frame has to be unique!");
                        b = false;
                    }
                }

            }while(b == false);
            mb.setFrameNumber(frame);
            mountainBikes[x] = mb;
        }

        return mountainBikes;
    }

    public static RacerBikes[] addRB(RacerBikes[] racerBikes){
        Scanner scn = new Scanner(System.in);
        for(int x = 0; x<racerBikes.length; x++){
            System.out.println("Add new Mountain Bikes");
            RacerBikes rb = new RacerBikes();

            System.out.println("Gear: ");
            rb.setGear(scn.nextInt());

            System.out.println("Speed: ");
            rb.setSpeed(scn.nextDouble());

            System.out.println("Handle Height: ");
            rb.setHandleHeight(scn.nextDouble());

            boolean b = true;
            int frame;
            do{
                System.out.println("FrameNumber: ");
                frame = scn.nextInt();
                b = true; 

                for(int y= 0; y< x; y++){
                    RacerBikes rb2 = new RacerBikes();
                    rb2 = (RacerBikes)racerBikes[y];

                    if (frame == rb2.getFrameNumber()){
                        System.out.println("The frame has to be unique!");
                        b = false;
                    }
                }

            }while(b == false);
            rb.setFrameNumber(frame);

            racerBikes[x] = rb;
        }

        return racerBikes;
    }

    public static void display(RacerBikes[] racerBikes, MountainBikes[] mountainBikes){
        try{Scanner scn = new Scanner(System.in);

            System.out.println("1. Mountain bikes");
            System.out.println("2. Racer bikes");

            int option = scn.nextInt();
            switch(option){
                case 1: {
                    for(int x = 0; x<mountainBikes.length; x++){
                        MountainBikes mb = new MountainBikes();
                        mb = (MountainBikes)mountainBikes[x];
                        System.out.println(mb.toString());
                    }
                }break;
                case 2:{
                    for(int x = 0; x<racerBikes.length; x++){
                        RacerBikes rb = new RacerBikes();
                        rb = (RacerBikes)racerBikes[x];
                        System.out.println(rb.toString());
                    }
                }; break;
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty");
        }
    }

    public static void  display2(RacerBikes[] racerBikes, MountainBikes[] mountainBikes){
        try{
            Scanner scn = new Scanner(System.in);

            System.out.println("1. Mountain bikes");
            System.out.println("2. Racer bikes");

            int option = scn.nextInt();
            switch(option){
                case 1: {
                    for(int x = 0; x<mountainBikes.length; x++){
                        MountainBikes mb = new MountainBikes();
                        mb = (MountainBikes)mountainBikes[x];
                        System.out.println("Frame number: "+mb.getFrameNumber());
                        System.out.println("Gear: "+mb.getGear());
                        System.out.println("Seat height: "+mb.getSeatHeight());
                        System.out.println("Speed: "+mb.getSpeed());
                    }
                }break;
                case 2:{
                    for(int x = 0; x<racerBikes.length; x++){
                        RacerBikes rb = new RacerBikes();
                        rb = (RacerBikes)racerBikes[x];
                        System.out.println("Frame number: "+ rb.getFrameNumber());
                        System.out.println("Gear: "+ rb.getGear());
                        System.out.println("Handle height: "+ rb.getHandleheight());
                        System.out.println("Speed: "+ rb.getSpeed());
                    }
                }; break;
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty");
        }
    }

    public static MountainBikes[] editMB(MountainBikes[] mountainBikes){
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the index of the value you want to edit: ");
            int index = scn.nextInt();

            MountainBikes mb = new MountainBikes();
            mb = (MountainBikes)mountainBikes[index];

            System.out.println("What do you want to edit? ");
            System.out.println("1.Gear ");
            System.out.println("2.Seat height ");
            System.out.println("3.Speed ");

            int option = scn.nextInt();
            switch(option){
                case 1: {
                    System.out.println("Gear: ");
                    mb.setGear(scn.nextInt());
                };break;
                case 2:{
                    System.out.println("Seat height: ");
                    mb.setSeatHeight(scn.nextDouble());
                };break;
                case 3: {
                    System.out.println("Speed: ");
                    mb.setSpeed(scn.nextDouble());
                }break;
                default: System.out.println("Wrong input");break;

            }
            mountainBikes[index] = mb;
            return mountainBikes;
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("The index is wrong");
        }catch(NullPointerException e){
            System.out.println("The array is empty");
        }

        return mountainBikes;
    }

    public static RacerBikes[] editRB(RacerBikes[] racerBikes){
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the index of the value you want to edit: ");
            int index = scn.nextInt();

            RacerBikes rb = new RacerBikes();
            rb = (RacerBikes)racerBikes[index];

            System.out.println("What do you want to edit? ");
            System.out.println("1.Gear ");
            System.out.println("2.Handle height ");
            System.out.println("3.Speed ");

            int option = scn.nextInt();
            switch(option){
                case 1: {
                    System.out.println("Gear: ");
                    rb.setGear(scn.nextInt());
                };break;
                case 2:{
                    System.out.println("Handle height: ");
                    rb.setHandleHeight(scn.nextDouble());
                };break;
                case 3: {
                    System.out.println("Speed: ");
                    rb.setSpeed(scn.nextDouble());
                }break;
                default: System.out.println("Wrong input");break;

            }
            racerBikes[index] = rb;
            return racerBikes;
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("The index is wrong");
        }catch(NullPointerException e){
            System.out.println("The array is empty");
        }

        return racerBikes;
    }

    public static int search(MountainBikes[] mountainBikes, RacerBikes[] racerBikes){
        try{
            Scanner scn = new Scanner(System.in);

            System.out.println("Input the number frame you are looking for: ");
            int frame = scn.nextInt();
            for(int x = 0; x<mountainBikes.length; x++){
                MountainBikes mb = new MountainBikes();
                mb = (MountainBikes)mountainBikes[x];
                if(frame == mb.getFrameNumber()){
                    return x;
                }
            }

            for(int x = 0; x< racerBikes.length; x++){
                RacerBikes rb = new RacerBikes();
                rb = (RacerBikes)racerBikes[x];
                if(frame == rb.getFrameNumber()){
                    return x;
                }
            }

        }catch(NullPointerException e){
            System.out.println("The array is empty");
        }
        return -1;
    }

    public static void callApplyBrakes(MountainBikes[] mountainBikes, RacerBikes[] racerBikes){
        try{
            for(int x = 0; x< mountainBikes.length; x++){
                MountainBikes mb = new MountainBikes();
                mb = (MountainBikes)mountainBikes[x];
                System.out.println("Old speed MB: " + mb.getSpeed());
                mb.applyBrake(2);
                System.out.println("New speed MB: " + mb.getSpeed());
            }

            for(int x = 0; x< racerBikes.length; x++){
                RacerBikes rb = new RacerBikes();
                rb = (RacerBikes)racerBikes[x];
                System.out.println("Old speed RB: " + rb.getSpeed());
                rb.applyBrake(2);
                System.out.println("New speed RB: " + rb.getSpeed());
            }

        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
    }

    public static void callSpeedUp(MountainBikes[] mountainBikes, RacerBikes[] racerBikes){
        try{
            for(int x = 0; x< mountainBikes.length; x++){
                MountainBikes mb = new MountainBikes();
                mb = (MountainBikes)mountainBikes[x];
                System.out.println("Old speed MB: " + mb.getSpeed());
                mb.speedUp(3);
                System.out.println("New speed MB: " + mb.getSpeed());
            }
            
            for(int x = 0; x< racerBikes.length; x++){
                RacerBikes rb = new RacerBikes();
                rb = (RacerBikes)racerBikes[x];
                System.out.println("Old speed RB: " + rb.getSpeed());
                rb.speedUp(3);
                System.out.println("New speed RB: " + rb.getSpeed());
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
    }
}
