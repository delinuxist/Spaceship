package org.example.model;

import org.junit.jupiter.api.*;

import java.util.List;

class SpaceshipTest {
    Spaceship spaceship;

    @BeforeEach
    void setup() {
        spaceship = new Spaceship(10);
    }

    @Test
    public void increaseSeatsByOne() {
        // given
        HumanSeat h1 = new HumanSeat("Joshua");
        // when
        spaceship.bookSeat(h1);
        // then
        Assertions.assertEquals(spaceship.getSeats().size(), 1);
    }

    @Test
    public void increaseSeatByTwo() {
        // given
        HumanSeat h1 = new HumanSeat("Joshua");
        MartianSeat m1 = new MartianSeat("Roger");

        // when
        spaceship.bookSeat(List.of(h1,m1));

        Assertions.assertEquals(spaceship.getSeats().size(),2);
    }

    @Test
    public void decreaseSeatByOne() {
        // given
        HumanSeat h1 = new HumanSeat("Joshua");
        MartianSeat m1 = new MartianSeat("Roger");

        // when
        spaceship.bookSeat(List.of(h1,m1));
        spaceship.removePassenger(m1);

        // then
        Assertions.assertEquals(spaceship.getSeats().size(),1);
    }

    @Test
    public void decreaseSeatByTwo() {
        // given
        HumanSeat h1 = new HumanSeat("Joshua");
        MartianSeat m1 = new MartianSeat("Roger");

        // when
        spaceship.bookSeat(List.of(h1,m1));
        spaceship.removePassenger(List.of(h1,m1));

        // then
        Assertions.assertEquals(spaceship.getSeats().size(),0);
    }
}