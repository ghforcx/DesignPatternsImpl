package com.CounterX.prototypePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Cloneable {
    private String content;
    private User author;

    public Blog copy() {
        return new Blog(this.content, this.author == null ? null : this.author.copy());
    }

    @Override
    public String toString() {
        return "Blog{" +
                "content='" + content + '\'' +
                ", author=" + author +
                "} @" + super.hashCode();
    }

    @Override
    public Blog clone() {
        try {
            return (Blog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
