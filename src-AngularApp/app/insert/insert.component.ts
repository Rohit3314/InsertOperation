import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private e1 : DemoService)
   { }

  ngOnInit(): void 
  {
  }
   
  insertdata(insertform:any)
  {
    return this.e1.insertempdata(insertform.value).subscribe();
  }

}
