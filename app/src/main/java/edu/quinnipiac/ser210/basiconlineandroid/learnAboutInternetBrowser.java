package edu.quinnipiac.ser210.basiconlineandroid;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class learnAboutInternetBrowser extends Fragment {
    public String text="";
    public learnAboutInternetBrowser() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn_about_internet_browser, container, false);
        Button browserParts = (Button) view.findViewById(R.id.browserParts);
        browserParts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "       The main parts of an internet browser are the address bar, the toolbar icons, the display window, and the scroll bars. \n\n      The address bar, also known as the title bar or the URL entry, is typically located at the top of your browser. It is used to show you the whole URL or website address of where you currently are as well as to allow you to navigate to a different website.  You can navigate to a different website my altering the URL displayed. \n\n     The toolbar icons tend to be located around the address bar and give you different features you can use with the browser window. These features include a back button that allows you to go to the previous website you were on, a forward button to navigate back to a prior page (if you used the back button), and a refresh button to reload the website screen you are on. These features tend to be located on the left side of the browser. Other features you can have on a tool bar are bookmarks or favorites which represent shortcuts to different websites, access to browser settings, and access to browser history. These options tend to be located on the right side of the browser.\n\n      The display window, also called the web page,  is the space beneath the browser bar that shows you a website. This displays the content of a website and allows you to interact with it. \n\n      The scroll bar is usually located on the wright side of the display window and indicate that a webpages full content is longer than a single screen. Scroll bars can be used to scroll through this extra content (my clicking and dragging on it) and can indicate roughly where you are in terms of a page's content (the beginning, towards the middle, or about to hit the end). ";
                trans.replace(R.id.root_frame, new internetBrowserInformation(text));

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button searchEngine = (Button) view.findViewById(R.id.searchEngines);
        searchEngine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "        When it comes to searching for things online, users have their pick between different search engines. The three most common ones are Google, Yahoo!, and Bing. \n\n     The first step to looking something up online is to open  your web browser to a new tab. Often times the address bar also functions as a search enginen , so you can type a question in and press enter. Otherwise you can use the address bar to navigatie to a search engine's website and look up things through there. \n\n        In many browsers, the first few results are concidered advertisements. Advertisements are shown based on your search terms but are not always useful or relevant. Such advertised results usually hold and indiciation they are advertisements. Most people agree it is more useful to just immediately look through the actual search results as opposed to the advertisements.\n\n        The words you enter into a search are called keywords or search terms, they are what search engines use to match results to your query. This way, you don't get a result about training a puppy if you're looking up a chocolate cake recipe. The relevant websites that appear as a result of your search are known as search results, you can open a result by clicking on it. You can also use the toolbar icons to return to the results page, refresh the page, or navigate foward to a page. \n\n      Sometimes what you search doesn't always return what you want. If that is the case, you can change the search terms you are using or even the search suggestions that appear under where  you type your search terms. Many search engines also offer a feature that allows you to use certain characters to refine your search. For example, in Google, including a hyphen '-' before a work will exclude any results that include it. Using quotation marks \"\" around words will only return results that include that word. \n\n        You can also refine what form your results come in, like a video, image, news article, or even a shopping product. Almost every search engine gives options to search specifically for things like images as opposed to any results that includes your desired terms. ";
                trans.replace(R.id.root_frame, new internetBrowserInformation(text));

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button browserTypes = (Button) view.findViewById(R.id.browserTypes);
        browserTypes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "    FireFox [top left] is known for being a good browser for power users. It is compatible with Windows, macOS, and Linux computers as well as iOS and Android phones. Pros of this browser include that its incredibly fast, has cross-platform sync (any webpages, bookmarks, etc. save across devices), and there is good privacy protection. Its main drawback is that it can be slower than competitors. Some of its security feature highlights include that it can alert you if your email address is included in a data breach, it blocks allow notification popups, and it blocks 'fingerprinting browser tracking' (identifies indivudal users based on their browser and device settings). It also allows users a lot of freedom in customaization, extensions, and plugins.\n\n     Internet Explorer [bottom right]  is an older browser that is slowly being replaced my Microsoft Edge, Window's newest internet browser. Some pros include that it is very fast, has crystal clear privacy tools, and can save sites as apps on your device. Unfortunetly, Windows really pushes it as a device default which some users don't always want. Microsoft Edge includes helpful features such as Read Aloud, the ability to cast media to Chromecast devices, and a plethora of add-ons like password managers and add-blockers. Other popular features are the ability to have very percise control over site permissions and an easy-to-undersand Privacy and Services page. \n\n     Google Chrome [bottom left] is the world's most popular browser with speedy performance, the ability to funcation cross-platform, and its expandability. Despite this, Chrome can also be very resource-hungry which can impact the speed of your device. Chrome also offers cool nifty features like autofill, alerting if your email has been compromised, and blocking for a lot of dangerous content even on connections concidered secure and safe. Some browsers, like Microsoft Edge, tend to mimic the look and feel of Google Chrome.\n\n      Safari [upper right] is Apple's default web browser. These days it has a bit of a different logo, but remains one of the top web browsers. Some pros include that its address bar doubles as a calculator and measurement converter, the Look Up feature (right click on any word on a web page and select Look Up to get a dictionary definition), syncing to iCloud for things like bookmarks and tabs (which allows for cross-platform usage), and you can even use ApplePay to purchase things. This browser is also decently fast and offers strong security and privacy options. Some cons of Safari is that it is not as customaizable, some websites do not always support Safari, and some features/options aren't always the clearest. \n\n       Every web browser can make a good choice for users looking to get on the internet, so the choice is really up to you. Each has its own pros and cons and all can offer a surperb experience.";
                trans.replace(R.id.root_frame, new internetBrowserInformation(text));


                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        return view;
    }
}
