import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Course } from '../model/course';
import { first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CoursesService {
  private readonly API = '/assets/courses.json'; /*temporary*/

  constructor(private hhtpClient: HttpClient) {}

  list() {
    return this.hhtpClient.get<Course[]>(this.API).pipe(
      first(), //to take only the first response from the server
      tap((courses) => console.log(courses))
    );
  }
}
