package com.kodilla.stream;

import com.kodilla.stream.beautifier.BeautifyingMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("jacek krygier",(text -> text.toUpperCase()));
        poemBeautifier.beautify("jacek krygier",(text -> text + "!!!"));
        poemBeautifier.beautify("jacek krygier", BeautifyingMethods::addABC);
        poemBeautifier.beautify("jacek krygier", BeautifyingMethods::addEmo);
        poemBeautifier.beautify("JaCek KryGier", (text -> text.toLowerCase()));

        //Zadanie 7.3
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                //poprawka
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("These are the male ForumUsers older than 20 years with at least 1 post published:");
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() +": "+ entry.getValue())
                .forEach(System.out::println);

    }
}
