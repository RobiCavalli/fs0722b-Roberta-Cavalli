import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  toDos : Todo[] =[];


  constructor() { }

  toggle(id:number) {
    this.toDos.map((t)=>{
      if (t.id === id) t.completed = !t.completed
      return console.log(t)
    })

  }

};





