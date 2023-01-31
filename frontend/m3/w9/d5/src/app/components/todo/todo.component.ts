import { Component, Input, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { TodosService } from 'src/app/services/todos.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {

  todo:Todo[]=[]
  addTask(Todo:any){
    setTimeout(() =>{

      return this.todo.push({id:this.todo.length,title:Todo,completed: false})
      }, 2000)
    console.log(Todo)


  }


  filterTodo(id: number) {
    console.log(this.todo)
    return this.todo.filter(t => t.id === id)
    }

    getPostById(id:number){

      return this.todo.find((t)=>{

       console.log (t.id)
      })}
    disattiva(id:number) {
        console.log(id);
        this.todo = this.todo.filter(t=>t.id!=id)
        this.tSrv.toggle(id);
      }

  constructor(private tSrv:TodosService) {

  }

  ngOnInit(): void {

  }
}
