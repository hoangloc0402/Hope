package com.sunset.hope.helpers;
import com.sunset.hope.entities.Contact;
import com.sunset.hope.entities.Post;
import com.sunset.hope.entities.User;

import java.util.concurrent.ThreadLocalRandom;

public class PostDataRandomizer {

    private String[] postId = {"1","2","3","4","5","6","7","8","9","0"};
    private User[] user = {
            new User("hoangloc","Nguyen Hoang Loc", new Contact(), true, ""),
            new User("minhhao","Van Minh Hao", new Contact(), false, ""),
            new User("vantuong","Nguyen Van Tuong", new Contact(), false, ""),
            new User("vanthanh","Nguyen Van Thanh", new Contact(), false, ""),
            new User("anhtien","Nguyen Huu Anh Tien", new Contact(), false, ""),
            new User("bvq1","Central Hospital", new Contact(), true, ""),
            new User("bvq2","Cho Ray Hospital", new Contact(), true, ""),
            new User("bvq3","115 Hospital", new Contact(), true, ""),
            new User("bvq4","Thong Nhat Hospital", new Contact(), true, ""),
            new User("bvq5","Chan Thuong Chinh Hinh Hospital", new Contact(), true, "")
    };
    private String[] type = {"Bloods", "Clothes", "Foods", "Medicines", "Money"};
    private String[] postTags = {"Donation", "Request"};
    private int[] images = null;
    private String[] description = {
            "For the public benefit, the relief and assistance of people in need (what) in any part of the world (where) who are the victims of war or natural disaster or catastrophe (who) by supplying them with medical aid (how).",
            "The relief of unemployment for the public benefit in [x place], including assistance to find employment",
            "Charity officers or administrators work for charitable organisations. Some of their duties are related to business development, project management, public relations, strategy, marketing, finance, etc. These officers have different tasks depending on the size of the charitable organization, for instance, in smaller charities they are responsible for advise and information tasks for volunteers.",
            "There are job openings in most UK cities for interested candidates. Work hours often fall in the evening or at the weekend as this is the best time to approach potential donors. Posts are usually hourly paid with rates from national minimum wage up to £8.00 per hour. Some employers provide bonus schemes based on donations raised.",
            "Positions for charity telephone fundraisers, street and door-to-door fundraisers require job incumbents to draw the attention of members of the public to specific causes and entice them into making one-off or ongoing donations, without leaving them with a disgruntled feeling. ",
            "Fundraisers for charity provide a vital link between the general public and needy causes both at home and abroad. People who have taken on the role are respected for their sunny natures and their dedication to furthering the lot of less fortunate individuals. ",
            "You must know how to create and use AlertDialog basically. This article will show you two advanced examples about how to add custom list items and custom view objects in android Alert Dialog.",
            "ALSAC (American Lebanese Syrian Associated Charities) was founded in 1957 and exists for the sole purpose of raising funds to support the operating and maintenance of St. Jude Children's Research Hospital. The mission of St. Jude Children's Research Hospital is to find cures for children with cancer and other catastrophic diseases through research and treatment. ",
            "The mission of Wounded Warrior Project is to honor and empower wounded warriors. Our purpose is: to raise awareness and enlist the public's aid for the needs of severely injured service men and women; to help severely injured service members aid and assist each other; and to provide unique, direct programs and services to meet the needs of severely injured service members.",
            "Charity Navigator is collaborating with GuideStar, GlobalGiving, Classy, and ImpactMatters to display impact-related information for rated nonprofits. However, not all rated nonprofits have provided impact information yet."};
    private boolean[] isClosed = {true, false};
    private int[] time = {1550920000,1550000000,1550123564,155092253,1550928977};
    private String[] title = {
            "Need Food Donation ",
            "Offer Blood of Type A",
            "Need more cloths for children",
            "Money Donation",
            "Donate 1000$ for young patients",
            "Fundraisers for charity",
            "Charity Comminication",
            "Offer Blood of Type AB"
    };
    private String[] phone = {
            "0123456789", "452365891","12452358","558865455","751226589","452621588","46623594","741852963"
    };
    private String[] address = {
            "123 Li Thuong Kiet ",
            "456 Ton Duc Thang",
            "489 Lu Gia",
            "Quan 2 TPHCM",
            "Quan Thu Duc",
            "Quan 1 TPHCM",
    };
    private String[] mail = {
            "hoangloc@gmail.com",
            "haohihi@gmail.com",
            "tuongwall@gmail.com",
            "thanh@hotmail.com",
            "tiennguyen@gmail.com",
            "khasan@gmail.com",
            "khanghihi@gmail.com",
            "vanhung@gmail.com"
    };

    private String[] comment = {
            "hoangloc@gmail.com",
            "haohihi@gmail.com",
            "tuongwall@gmail.com",
            "thanh@hotmail.com",
            "tiennguyen@gmail.com",
            "khasan@gmail.com",
            "khanghihi@gmail.com",
            "vanhung@gmail.com"
    };

    Integer getNum(Integer max){
        return ThreadLocalRandom.current().nextInt(0, max);
    }

    public Post getPost(){
        return new Post(
            postId[getNum(postId.length)],
            user[getNum(user.length)],
            type[getNum(type.length)],
            postTags[getNum(postTags.length)],
            null,
            description[getNum(description.length)],
            isClosed[getNum(isClosed.length)],
            time[getNum(time.length)],
            title[getNum(title.length)],
            new Contact(phone[getNum(phone.length)], address[getNum(address.length)], mail[getNum(mail.length)]),
            comment
        );
    }
}
