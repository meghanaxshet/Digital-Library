package com.raikar.dto;

import com.raikar.model.Author;
import com.raikar.model.Book;
import com.raikar.model.BookType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class BookRequest {

    @NotBlank(message = "Enter Book Title")
    private String bookTitle;

    @NotBlank(message = "Enter Book No")
    private String bookNo;

    @Positive(message = "Enter Positive Security Amt")
    private int SecurityAmount;

    @NotBlank(message = "Enter Author Name")
    private String authorName;

    @NotBlank(message = "Enter author Email")
    private String authorEmail;

    @NotNull(message = "Enter Book Type")
    private BookType bookType;


    public Author toAuthor() {
       return Author.builder().
                name(this.authorName)
                        .email(this.authorEmail).
                build();

    }

    public Book toBook(){
        return Book.builder().
                title(this.bookTitle)
                        .bookNo(this.bookNo)
                                .securityAmount(this.SecurityAmount)
                                        .bookType(this.bookType).
                build();
    }
}
