import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription, interval } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  mySubscription : Subscription;
  constructor(private router: Router) { 
    this.mySubscription = interval(1000).subscribe(data => {
      console.log(data);
    });
  }

// goToId(id){
//   this.router.navigateByUrl(`/user/${id}`);
// }

  ngOnInit() {
  }

  goToId(id, name, url) {
    this.router.navigate([`/user/${id}`], {
      queryParams: {userName: name, userImage: url}
    });
  }

  //TO UNSUBSCRIBE
  ngOnDestroy() {
    // this.mySubscription.unsubscribe();
  }

}
