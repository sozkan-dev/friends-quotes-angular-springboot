import { Component, Injectable, OnInit } from '@angular/core';
import { Quote } from './quote';
import { QuoteService } from './quote.service';

@Component({
  selector: 'app-quotes',
  templateUrl: './quotes.component.html',
  styleUrls: ['./quotes.component.css']
})
export class QuotesComponent implements OnInit {

  quotes: any[] = [];
  quote: string | undefined;
  character: string | undefined;


  constructor(private quoteService: QuoteService){}


  ngOnInit(): void {
    this.getQuotes();
  }

  getQuotes(): void{
    this.quoteService.getQuotes().subscribe((data) => {
      this.quotes = data;
      this.getRandomQuote();
    },
    (error) => {
      console.error(error)
    }
    )
  }

  getRandomQuote(){
    const randomIndex= Math.floor(Math.random() * this.quotes.length);
    this.quote= this.quotes[randomIndex].quote;
    this.character = this.quotes[randomIndex].character;
  }

}
