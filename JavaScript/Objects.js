/* You need to make a formatted sentence using the relevant information, which will be contained in an input object called book.

The format of the sentence should be:
BOOK_NAME by AUTHOR_NAME was published in PUBLISH_YEAR.

Log this sentence to the console.

Sample Input0
let book = {

title: "The Great Gatsby",
author: "F. Scott Fitzgerald",
publishedYear: "1925",

};

Sample Ouput0
The Great Gatsby by F. Scott Fitzgerald was published in 1925. */

function main(book) {
    const sentence = '${book.title} by ${book.autohr} was published in ${book.publishedYear}.';
    console.log(sentence);
}
let book = {
    title: "The Great Gatsby",
    author: "F. Scott Fitzgerald",
    publishedYear: "1925",
  };