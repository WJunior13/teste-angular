import { Component, OnInit } from '@angular/core';
import { Client } from '../client';
import { ActivatedRoute,Router } from '@angular/router';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.css']
})
export class ClientDetailsComponent implements OnInit {
  clients: Client[];
  id: number
  client: Client
  constructor(private route: ActivatedRoute, private clientService: ClientService, private router: Router) { }

  ngOnInit(): void {
    this.getClients();
    this.id = this.route.snapshot.params['id'];

    this.client = new Client();
    this.clientService.getClientById(this.id).subscribe( data => {
      this.client = data;
    });
  
  }
  private getClients(){
    this.clientService.getClientsList().subscribe(data => {
      this.clients = data;
    });
  }

  clientDetails(id: number){
    this.router.navigate(['client-details', id]);
  }

  updateClient(id: number){
    this.router.navigate(['update-client', id]);
  }

  deleteClient(id: number){
    this.clientService.deleteClient(id).subscribe( data => {
      console.log(data);
      this.getClients();
    })
  }
  

}


 


