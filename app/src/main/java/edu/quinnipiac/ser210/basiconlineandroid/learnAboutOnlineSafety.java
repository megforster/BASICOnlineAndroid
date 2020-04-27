package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class learnAboutOnlineSafety extends Fragment {
    public String text="";
    public learnAboutOnlineSafety() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn_about_online_safety, container, false);
        Button passwords = (Button) view.findViewById(R.id.passwords);
        passwords.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "    Many individuals create and use unsafe passwords daily, none the wiser to what makes a safe password nor the importance of having one. There are a few practices that once implemented will protect your accounts and infomation online. \n\n      An important first step is to make sure you have passwords enabled for anything you can. While many accounts require you to have a password, many devices don't. Without locking your internet-enabled devices, you leave them open to anyone who happens to get access to them. This is dangerous for many reasons, including leaving contacts and other personal information vunerable and possibly allowing someone else to access your other accoutns and impersonate you. \n\n      It is also key to understand what makes up a strong password. A strong password is at least 8 characters in length (with another reccomedation being 12 or more characters). You should avoid using any dictionary words or personal information. Strong passwords tend to include both upper and lower-case letters, at least one number, and at least one special character such as '!', '?', '-', ect. Some websites have restrictions on which special characters can be used so look out for what when creating an account. \n\n       If you struggle to come up with strong passwords there are a few options that can help. One option would be to get a password keeper (make sure to do your research and select a reputable one) and use that to log into your accounts. Many password keepers, besides protecting your passwords and remebering them for you also have a feature to randomly generate a safe password. Some methods you can use on your own to create a safe password include the revised passphrase method, the sentence method, and the muscle memeory method. The revised passphrase method involves choosing bizarre and uncommon words to combine into a password. An example of this would be QuagmireHancockMerciDeNada. The sentence phrase involves thinking of a random sentence and taking the first or first two letters of every word in the sentence to make your password. For example, “The Old Duke is my favorite pub in South London” would give ThOlDuismyfapuinSoLo. Finally, the muscle memory method involves having a radom password generated until you find one that looks readable, and then typing it over and over again until it becomes muscle memory.\n\n       Some devices and online accounts allow for use of finger print recognition, facial recognition, or two-factor authentication in lieu of or on top of a strong password. It is generally reccomended to use these options if you can, but they are not necessary. \n\n       Another good tip is to be careful of who you share your passwords with. It is generally advised not to share your passwords with anyone, but if you do to make sure that person is trustworthy. By handing someone over your password(s) you are essentially giving them the keys to the kingdom. \n\n      A final reccomedation for password safety is to not resue the same password for different things, and to change your password regualrly. Reusing the same password for multiple things is dangerous becuase if that password is figured out on one site my a malicious person, they can then go on to log into your other accounts. Changing your password reguarly can also limit the probability a malicious user will find a current password and be able to hack into any accounts.";
                trans.replace(R.id.root_frame, new onlineSafetyInformation(text));

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button threats = (Button) view.findViewById(R.id.threats);
        threats.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "    While there are many dangers online, as there are in real life, some are more common than others. Some threats you should be on the lookout for are phishing, ransomware, computer viruses and malware. \n\n    Phishing (pronouced fishing) is a method people use to gather personal information via deceptive emails and websites. The goal is to trick targets into believing the email/website is real so they download an attachment, click a link, or enter some information in. Most of the time attackers pretend to be figures of authority, like a bank, a higher authority at the victim's place of work, or even a government agency. You can protect yourself against phishing attacks by remembering that no credible authority will randomly ask for your personal information to be sent by email, never click links you think are contained in a fake email, and to verify with an outside source if a request is legitamte. If the email claims to be your bank, call your bank. If the email claims to be a manger at your place of employment, ask your boss. \n\n     Ransomware is a type of malware that encrypts people's files, with the attacker typically demanding a large sum of money to reverse the encryption or else the information will be destroyed. Encryption makes file inaccessibale, it locks them away behind a mathematical key only the attacker knows. Good ways to defend against ransomeware are to back up your files frequently, install reputable antivirus software, keep your computer or other devices updated, and to not install software or give it administrator rights (the keys to the city) to your computer. While the average computer user isn't the typical high priority target for ransomware, it is better to be safe than sorry and take precaution.\n\n       Computer viruses are often linked to the flu as they are designed to spread host to host and has the ability to replicate itself. However, unlike the flu, computer viruses are malicious computer programs written to change the way your computer operates. They attach themslves to programs and documents that support macros (a program or script used to handle repeated actions like keystrokes, mouse clicks, and other types of input) that unknowingly execute virus code. Viruses can only run if you run the infected code, otherwise they lie dormant. This can make viruses difficult to detect. Once a virus is triggered, it can even go on to infect other devices on the same network, record what keys you press (to get usernames and passwords to accounts, etc.), corrupt your files, or evn shut down your computer entirely. Signs that your computer could be infected by a virus are freqent pop-up windows, unsually slow computer performance, random programs appearing or running when you start your computer, cand hanges to your web browser's home page. The best ways to protect yourself from computer viruses is to download and use a treusted antivirus software, avoid clicking on pop-ups, scan attachments before opening them, and scan any files you download. \n\n     Malware is an umbrella term of malicious software, or programs/code that are harmfil to computer systems. Malware mainly aims to invade, damage, and disable computers, computer systems, networks, etc. This is often accomplished by taking over control (or partial control) of a device. Malware usually cannot damange the hardware of the devices or networks it infects, but it can steal, encrypt, delete, or alter computer fucntions and data as well as spy on your computer activity. Signs that your computer may have malware include your computer slwoing down, random pop-up adds, your computer repeatedbly freezes or chrashes, you suddenly have less space on your computer, your internet browser home page changes without your permission, and your antivirius program stops working and you cannot update it (Malware can disable such programs). You can protect yourself from Malware by using a reputable anti-malware program and reguarly running scans using it, changing your passwords if a scan comes up with an infection, staying vigilant online, and being careful with what you download on your devices. ";
                trans.replace(R.id.root_frame, new onlineSafetyInformation(text));

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        Button info = (Button) view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                text = "    When it comes to getting online, treat your personal information like you would your money: make sure it is safe and you don't just give it away to everyone and their mother. Protecting your infromation online is incredibly vital to staying safe online as well as in life.\n\n       One of the number one tips is to use strong passwords and use the locking feature on any device. This prevents prying eyes from snopping through your accounts/devices and protects devices in the case they get stolen. \n\n       It is also important to think before you act. If an email seems fishy, just delete it. Also be wary of emails or pop ups that create a sense of urgency. For example 'A virus has been detected on your computer! Download this antivirus softwrae now!' or an email from you 'bank' saying if you don't reply with your account infromation your account will be closed. The pop ups are fake (it can't scan your computer without your knowledge) and professional banks would never have you submit personal information via email. \n\n      You should also be careful about what you post online and who is allowed to see your posts. A hard and fast rule of the internet is once it is out there, it will never go away. So if you post your address or other personal information almost anyone would be able to see it. One safeguard against this could be to control who can access your posts. Most social media sites by default have everyone able to see everyone's posts, but offer the option to limit it to friends, connections, followers, etc. You are also able to control who you are tied to on social media by requiring people to request to friend/follow/connect/etc.  with you rather than such actions just going through. \n\n      If there comes a time where you no longer use a social media account, just shut it down. Just becuase you are no longer using an acount doesn't mean it disappears. Any posts you've shared (including personal information) will remain up and visible to anyone you gave access (or everyone if you did not control for that). Such accounts can also be involved in data breaches, instances where malicious users gain access to or information about accouts/customers of a company. Such information could include email address, passwords, pictures, documents, etc. It is never a good idea to leave dormant accounts lying around. \n\n       While the internet brings so much benefit, it can also be a dangerous place. The best way to protect yourself is to be vigilant and to be careful what you share about yourself.";
                trans.replace(R.id.root_frame, new onlineSafetyInformation(text));


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
