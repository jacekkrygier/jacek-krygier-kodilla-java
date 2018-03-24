package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "jacekkrygier", 'M', LocalDate.of(1987, 5, 17), 34));
        forumUserList.add(new ForumUser(2, "sylwiarachanczyk", 'F', LocalDate.of(1997, 6, 30), 51));
        forumUserList.add(new ForumUser(3, "adriankapnik", 'M', LocalDate.of(1989, 8, 12), 0));
        forumUserList.add(new ForumUser(4, "anitarafalska", 'F', LocalDate.of(2002, 7, 18), 17));
        forumUserList.add(new ForumUser(5, "marcinkczmarski", 'M', LocalDate.of(2001, 1, 2), 21));
        forumUserList.add(new ForumUser(6, "radoslawskorupski", 'M', LocalDate.of(2005, 11, 24), 0));
        forumUserList.add(new ForumUser(7, "piotrlipiec", 'M', LocalDate.of(1979, 10, 5), 14));
    }

        public List<ForumUser> getList() {
            return new ArrayList<>(forumUserList);

    }
}
