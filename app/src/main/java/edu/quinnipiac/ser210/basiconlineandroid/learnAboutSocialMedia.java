/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */


package edu.quinnipiac.ser210.basiconlineandroid;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class learnAboutSocialMedia extends Fragment {
    public String text="";
    public learnAboutSocialMedia() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_learn_about_social_media, container, false);

        //Reference to option button
        Button socialGroups = (Button) view.findViewById(R.id.SocGroups);

        //When button is pressed replace the text of the fragment displaying computer info and show said fragment
        socialGroups.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                text = "    There are many social media sites in existance for people to use. Some are used world-wide, while others tend to be more country specific. Some of the most popular social media groups inlcude Facebook, Instagram, SnapChat, Twitter, YouTube, LinkedIn, and Pinterest\n\n       Facebook is a social media group founded in 2004 and was orginally meant to serve as an online student directory for Harvard Univerity (Facebook's founder being a Harvard student at the time). Over the years FaceBook evolved into a socal media site anyone could use after making an account. Its primary use is for people to keep in touch with eachother easily. Since Facebook is a free service there is no need to divuldge financial information, and you can put what personal information you want onto an account. In order to create an account, however, you do need a valid email address. After creating an account you can 'Friend' people you know and 'follow' the pages of celebrities, public figures, or gorups. You can communicate with others via 'posts' which are messages you share with others, messages, which are similar to text messages or emails, or commenting on someone else's post. Facebook is a favorite for a lot of adults which makes it easier to connect with more people you know. \n\n     Instagram is another popular social media group whose main focus is on sharing pictures. It was founded in 2010 and bought by Facebook in 2012. Instagram puts less emphasis on personal connection, with communication limisted to comments on pictures, DMs (direct messages), or Instragram Live videos where people can livestream themselves. A majority of Instagram users are in the younger generations, though that by no means prevents anyone from using it and there is a growing population of elder adults posting pictures and enjoying all Instagram has to offer. Similar to Facebook, Instagram lets user 'follow' someone in order to see ther posts and see when they 'go live'. You also do not have to post any pictures in order to view other pictures, all you need is a valid email to make an account. \n\n      SnapChat is another picture-centric social media group, however, there is more of an emphasis on individual communication. SnapChat allows users to friend eachother, afterwhich they can send timed or 'infinite' photos and videos to eachother. You can even inlcude 'filters' on videos and stories, which are pictures or animations that overlay on top of your photo or video. A common filter is hearts that float above your head or on your cheeks. Filters move as you do and can even be responsive.  Once the user clicks off a photo or video there is an opporunity to 'replay it' otherwise it is 'gone forever'. Users can also post and view 'stories' which are mean for a wider audiance. Users can restrict who can use their stories. SnapChat and other companies also publish content on SnapChat that views can watch or read. Another cool feature is you can save photos, videos, or stories you take to save and view them later; each year SnapChat even pulls up things you saved on that day in the past for you. Similar to Instagram, SnapChat is more populated with a younger crowd, though many individuals in older generations enjoy using it as well.  \n\n    Twitter is a unqiue form of social media in that it is center around messages of up to 280 characters called 'tweets'. Once making an account using a valid email address, users can 'follow' anyone (though some accounts are private and need the account owners permission) to see their tweets. From there, you can heart tweets, comment on them, repost them, or share them via DMs in the applicaiton or via text message among other means. Twitter was founded in 2006 and is popular among all age groups. Thanks to its restricted message size, Twitter is one of the more fast-paced social media groups and can be a good place to read breaking news. However, like with all social media sites, it is important to check whether the news you are reading is true or not before believeing it. This esepcially goes for Twitter as a large portion of its user base is often satirical. \n\n     YouTube was founded in 2005 (and bought by Google in 2006) and is a social media group based around videos. If you can think of it, odds are YouTube has numerous videos for it. With topics ranging coding, to cooking, to gaming, to even cow milking, YouTube appeals  to a very wide audaince. You can make an account with YouTube using a valid email address where you can watch videos, post videos or both. YouTube allows users to 'subscribe' to channels which is similar to 'following' on Twitter or Instagram. For an account you follow you can change notificaiton settings which can alert you every time a channel you subscribe to posts a video. YouTube also offers a live steaming option as well as community tabs for channels where subscribers and the channel owner(s) can itneract with eachother. For videos you watch you can either 'like' or 'dislike' them, or even add them to a 'play list' or a watch later list. Though primarily used as a source of entertainment, YouTube can also be a powerful learning tool. \n\n     LinkedIn is social media for the professional world. Primarily known as a professional networking tool, it is designed to help people make buisness connections, share professional tips, and even find jobs. Creating a LinkedIn account takes a working email, and users are encouraged to fill out their account information as much as possible (due to the empasis on professional connections and opportunites). Account information focuses primaryly on education, awards, work experience, and certificaitons among other topics. Owned by Microsoft, Linkedin is similar to Facebook in that you can post updates to 'connections' (LinkedIn's version of friends), send DMs to people, and share/comment/like content posted by others. There are also accounts for buisness you can follow as well experts in any professional field. LinkedIn also doubles as a job search tool, as companies can post openings to LinkedIn and applications can apply using LinkedIn (a fully filled-out account acting much like a resume). LinkedIn is used by individuals of all ages, though primarly those who are working or seeking employment.  \n\n     Pinterest is another popular social media group that was founded in in 2009. Similar to Instagram, it is also focused on pictues and posts.  Pinterest is also known for being one of the more intutitive social media options making it easy to get the hang of. Anyone can make an account for Pinterest using an email address (or Facebook account), and from there accounts are broken down into groupings called 'boards'.  An easy way to understand 'boards' is to think of them as a digital filing system for ideas. Pinterest allows users to 'follow' both people (or companies) and boards. If a user likes a particular image or post, they can 'pin' it to a board on their account. Pinterest is very well know for DIY projects that span home decoration to cooking, though you can post or see just about any content you want. Other popular pinterest boards center around beauty, books, wedding, and fashion. Pinterest is popular with all demographics and offers something for everyone.  ";
                trans.replace(R.id.root_frame, new socialMediaInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

                //Allows for backwards navigation
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button terms = (Button) view.findViewById(R.id.terms);
        terms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                text = "AMA: acronym for 'ask me anything'\n\nAvatar: an image that represents a person on social media sites\n\nBio: a short bit of text people use to explain who they are on social media sites\n\nBlock: to prevent someone from contacting and interacting with you on social media sites\n\nChat: any kind of communication over the internet, though usually one-on-one communication; also known instant messaging (IM)\n\nClickbait: marketing or advertising material that employs a sensationalized headline to attract clicks\n\nComment: a response that is often provided as an answer or reaction to a blog post or message on a social network\n\nConnection: Linkedin equivalent of a Facebook 'friend'\n\nDirect Message (DM): private concersations that occur on twitter, both parties must be following eachother\n\nFans: people who like a Facebook page\n\nFollower: a person who supscribes to a social media account\n\nFriend: term used to represent connections (not to be confused with Linkedin Connections) made on Facebook\n\nGif (Graphics Interchangable Format): small-scale animations and film clips\n\nHandle: used to describe someones username on Twitter\n\nHashtag: tag used on a variety of social media sites as a way to annotate a message or categorize information \n\nInstant Messaging (IM): real-time, direct text-based communication between two or more people \n\nLike: another way for users to show approval of a post or update; an action enabled on social media sites\n\nLive Steaming: delivering content over the internet in real-time\n\nMeme: a thought, idea, or joke popular on the internet\n\nMention: a Twitter term used to describe an instance in which a user includes someone else's username in their tweet\n\nPodcast: a series of digital media files, usually audio, that are released episodically\n\nPost: a social media status update, photo, or video\n\nPin: a pintrest term for posting \n\nReply: a Twitter action that allows a user to respond to another use through a seperate tweet that mentions the other user's username\n\nRetweet: a Twitter term for sharing another user's tweet\n\nSelfie: a self-portrait picture taken using the front-facing camera on a device\n\nSpam: unnecessary, unwanted, or repetitive content \n\nTag: keyword added to a social media post to categorize content; people can also be tagged\n\nTroll: someone who is known for creating controvery or bullying others online\n\nTweet: a post to Twitter that has a limit of 280 characters and can include photos, videos, and links\n\nViral: when a piece of content recieves noteworthy awareness\n\nVlogging: a piece of content that employs video to tell a story or information";
                trans.replace(R.id.root_frame, new socialMediaInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button concerns = (Button) view.findViewById(R.id.concerns);
        concerns.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                text = "    Common concerns associated with social media include anxiety, depression, self-esteem, and lonliness. It is important when using social media sites to make sure you are using them responsibly and taking a step back if you feel they are impacting you negatively. \n\n     While research hasn't proven a clear reason behind the correlation between social media and anxiety, its been proven that users of social media tend to be more axious than those who do not use it.  The symptoms tend to be feelings of restlessness and worry, trouble sleeping, and trouble concentrating. A study posted in the jounral  Computation and Human dehavior determined that using seven or more social media platforms resulted in users being three times more likely to have high levels of generalized anxiety than those who used zero to two platforms. More research will have to be done in the future to deterime why this pattern has been seen, but in the meantime make sure you aren't getting anxious. \n\n       Social media has found been found to increase and decrease feelings of depression in users. Two studies found that depressive symptons were linked to the quality of online interaction. For example, the more negative online interactions one has the higher the chance of experiencing depressive symptoms. Another study found a threefold risk of depression and anxiety among those that use social media, and attributed it to cyber-bullying, having a distorted view of other people's lives, and feeling like time spent on social media is a waste. It's important that if you start to feel depressive symptoms when using social media to cut back and reach out to those around you. \n\n     Lowered self-esteem is another observed con to social media, particaruly for women. Thanks to advancing technology for editing photos, and the inability to see more than the moment(s) captured in photos, users of social media tend to feel worse about themselves. A study conducted by Penn State University suggested that users of social media may experience lower self-esteem becuase they are continuously comparing themselves to photos of people at their happiest. Research from the University of Strathclyde, Ohio University, and University of Iowa found that women especially tend to compare themselves to negatively to images of other women. If you find social media has negatively impacted your self-esteem, it is perfectly okay to take a break from it!\n\n       Another risk, though certainly not the last, is an increased perception of social isolated or lonliness. A study from the American Journal of Medicne found that those who spend the most time on social media were twice as likely to report feeling a lack of sense of social belonging and a lack of fulfilling relationships. Another theory as to why social media can increase feelings of lonliness is that spending more time on social media displaces face-to-face interaction and can make people feel excluded. Social media was designed to bring people together, so if you find it's making you feel more lonely, take a step back and make plans with a friend!\n\n     While social media has many benefits, it is important to watch out for a lot of the drawbacks associated with it. As with most things, moderation is key. Social media is supposed to be a tool to enhance your life, so it's important to make sure it does not become your life.";
                trans.replace(R.id.root_frame, new socialMediaInformation(text));

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });








        return view;
    }
}
