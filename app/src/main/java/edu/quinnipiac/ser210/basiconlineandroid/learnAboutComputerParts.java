package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class learnAboutComputerParts extends Fragment {
    public String text = "";

    // Required empty public constructor
    public learnAboutComputerParts() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn_about_computer_parts, container, false);

        //Reference to option button
        Button computerParts = (Button) view.findViewById(R.id.PartsOfComp);

        //When button is pressed replace the text of the fragment displaying computer info and show said fragment
        computerParts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                text = "    Computers have four basic parts: the monitor, the keyboard, the mouse, and the tower. This is the same for desktop computers and laptop computers.\n\n  The monitor is what allows you to see things. It displays any text, pictures, or videos as you use the computer. It is very similar to the screen on a cell phone (though not all monitors are touch screen. \n\n   The keyboard is what allows you to type things into the computer. Each key you press tells the computer a piece of information. Computer keyboards are similar to typewriter keyboards, only the text shows up on the computer screen instead of paper. \n\n    The mouse also allows you to interact with the computer. On a computer screen you will have something know as a cursor. It can look like a little arrow, a blinking verticle line or letter I, or even a hand. The mouse is how you move the cursor around the screen. The mouse also allows you to click, or select, something on screen. When move the cursor over something you want, and click the mouse, you've told the computer you want to do something with that item. While desktop computers usually have a mouse, laptop computers usually have a trackpad. With a trackpad you use your finder and slide it across the trackpad to move the mouse. Some trackpads have buttons similar to a mouse for clicking, while others have you press down on the trackpad to click.\n\n     The tower is the computer itself. It holds all the mechanical parts and little pieces that allow the computer to work.  Often times people will mistakeny call the monitor a computer, but without the tower the monitor cannot function as a computer. Laptops don't have a tower, but are still computers. That is becuase laptops hold the mechanical parts and little pieces inside of themselves. ";
                trans.replace(R.id.root_frame, new computerPartsInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

                //Allows for backwards naviation
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button lapVsDesk = (Button) view.findViewById(R.id.LapVsDesk);
        lapVsDesk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                text = "    Desktop computers, as the name implies, are meant to stay on desks.  As such, they are generally larger than laptops and have larger screens. You are also usually able to change the mouse and keyboard you use with your desktop computer. Desktop computers also generally have more storage capacity and are able to do more things at once. They are well-suited for tasks like word-processing, printing documents, or simply having more than one window open at a time. However, they must be plugged in at all times in order to be used. \n\n     Laptop computers are smaller, more portable versions of desktop computers.  Unlike desktop computers, you can take laptop computers anywhere you go and use them. They don't have to be plugged in all the time since they run on battery power. However, they can run out of battery and need to be charged (laptop computers come with chargers). Since the keyboard and mouse are built in, it is not easy to simply change them. There are wireless mice and keyboard you can plug into your laptop and use if you'd like. Similar to desktops, laptops are good for multi-tasking, word processing, though you typically cannot have as many windows open at once. Even though laptop comptuers can have less storage space than desktop computers, there is still enough for the average user. ";
                trans.replace(R.id.root_frame, new computerPartsInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button app = (Button) view.findViewById(R.id.Apps);
        app.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                text = "    An application is a software program that runs on a computer. Some common examples of computer applications are web browsers, word processors, utilities,  and e-mail programs. \n\n    Some applications come with your computer. For example, Apple computers come with a calendar application, called Calendar, and Safari as a web browser. Windows computers come with Microsoft Edge as a web browser and it also has a mail application, called Mail. \n\n      You can also install applications on your computer that may not come installed with the computer. These can include ones for safety, like MalwareBytes, ones for listening to music, like Spotify, ones for keeping in touch with friends and family like Skype, and even other internet browsers like Chrome or Firefox. There is probably an application for everything you could think of!\n\n       However, when installing any applications on your computer you have to be careful! Only download applications from trusted soruces, like the application stores that come downloaded with most computers. Applications you try to download from the internet may contain viruses or other malicious software. If you aren't sure if something is safe, ask family of friends if they have heard of it, or do some more research online. ";
                trans.replace(R.id.root_frame, new computerPartsInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });


        return view;
    }


}
