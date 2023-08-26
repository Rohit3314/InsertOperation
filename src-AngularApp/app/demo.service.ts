import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  constructor(private h1 : HttpClient)
   { }

   link1 = "http://localhost:9001/insertrecord";
   link2 = "http://localhost:9001/deleterecord";
   link3 = "http://localhost:9001/updaterecord";
   link4 = "http://localhost:9001/viewrecord";


   insertempdata(data : any)
   {
      return this.h1.post(this.link1,data);
   }
}
