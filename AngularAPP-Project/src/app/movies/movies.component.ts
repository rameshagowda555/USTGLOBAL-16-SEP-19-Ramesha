 import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  selectedMovies;
  Movies = [
    {
      name :'Adventure',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      rating : 'Rating: 5/10',
      info : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      name :'Charlie Chaplin',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      rating : 'Rating : 6/10',
      info : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
    },
    {
      name :'Spider Man',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      rating : 'Rating : 9/10',
      info : 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.'
    },
    {
      name :'Avengers',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      rating : 'Rating 10/10',
      info : 'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with'
    },
    {
      name :'Iron Man',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      rating : 'Rating : 10/10',
      info : 'When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.'
    },
    {
      name :'Super Man',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/07/14/12/58/superhero-2503808__340.jpg',
      rating : 'Rating : 8/10',
      info : 'Superman is a fictional superhero. The character was created by writer Jerry Siegel and artist Joe Shuster, and first appeared in Action Comics #1, a comic book published on April 18, 1938.'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
 sendMovies(movie){
   this.selectedMovies=movie;
   console.log(movie);
 }
}
