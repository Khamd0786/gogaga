package com.company.gogagademo.database;

import com.company.gogagademo.R;
import com.company.gogagademo.database.model.Chats;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Chats> getAllList() {
        ArrayList<Chats> list = new ArrayList<>();

        list.add(new Chats(
                "Hammad",
                "07:30",
                "Working on GoGaga project!",
                R.drawable.dppp,
                "1"
        ));

        list.add(new Chats(
                "Ayushi",
                "07:30",
                "Hello!",
                R.drawable.dp_1,
                ""
        ));
        list.add(new Chats(
                "Aanand",
                "07:30",
                "right now i am not free bro!",
                R.drawable.dp_2,
                "2"
        ));
        list.add(new Chats(
                "Prabhat",
                "07:30",
                "How's Doing?",
                0,
                "4"
        ));
        list.add(new Chats(
                "Shivani",
                "07:30",
                "Whatsaup?!",
                R.drawable.dp_5,
                ""
        ));
        list.add(new Chats(
                "Kartik",
                "07:30",
                "Doing great bro :)",
                0,
                "3"
        ));
        list.add(new Chats(
                "Harshita",
                "07:30",
                "Studying!",
                R.drawable.dp_p_1,
                "1"
        ));
 list.add(new Chats(
                "Hammad",
                "07:30",
                "Working on GoGaga project!",
                R.drawable.dp_p_2,
                "1"
        ));

        list.add(new Chats(
                "Ayushi",
                "07:30",
                "Hello!",
                R.drawable.dp_1,
                ""
        ));
        list.add(new Chats(
                "Aanand",
                "07:30",
                "right now i am not free bro!",
                R.drawable.dp_p_1,
                "2"
        ));
        list.add(new Chats(
                "Prabhat",
                "07:30",
                "How's Doing?",
                0,
                "4"
        ));
        list.add(new Chats(
                "Shivani",
                "07:30",
                "Whatsaup?!",
                R.drawable.dp_5,
                ""
        ));
        list.add(new Chats(
                "Kartik",
                "07:30",
                "Doing great bro :)",
                0,
                "3"
        ));
        list.add(new Chats(
                "Harshita",
                "07:30",
                "Studying!",
                R.drawable.dp_p_2,
                "1"
        ));


        return list;

    }
}
