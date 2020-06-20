import { Injectable } from '@angular/core';
import { HttpClient, HttpClientXsrfModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private base_url = "http://localhost:8080/books?size=100";
  constructor(private httpClient : HttpClient) { }
  
  getBooks() : Observable<Book[]>{
    return this.httpClient.get<GetResponseBooks>(this.base_url).pipe(
      map(response => response._embedded.books)
    );
  }

}
interface GetResponseBooks{
  _embedded : {
    books : Book[];
  }
}
