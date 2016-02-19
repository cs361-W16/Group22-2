package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Yizheng on 2016/2/19.
 */
    public class SpanishCard implements Serializable {
        public final int value;
        public final SpSuit suit;

        @JsonCreator
        public SpanishCard(@JsonProperty("value") int value, @JsonProperty("suit") SpSuit suit) {
            this.value = value;
            this.suit = suit;

        }

        public SpSuit getSuit() {
            return suit;
        }

        public int getValue() {
            return value;
        }

        public String toString() {
            return this.value + this.suit.toString();
        }
    }

