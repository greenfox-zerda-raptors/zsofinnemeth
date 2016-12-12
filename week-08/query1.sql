/* Q1 Find the titles of all movies directed by Steven Spielberg. */
select m.title 
from movie m 
where m.director like "%Spielberg%";

/* Q2 Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.*/
select distinct year 
from movie m 
join rating r 
on r.mID = M.mID 
where R.stars > 3 
order by year asc;


/* Q3 Find the titles of all movies that have no ratings. */
select m.title 
from movie m 
left join rating r 
on m.mid = r.mid 
where r.mid is null;

/* Q4 Some reviewers didn't provide a date with their rating. 
Find the names of all reviewers who have ratings with a NULL value for the date */

select re.name
from reviewer re
left join rating r
on r.rid = re.rid
where r.ratingDate is null;

/* Q5 Write a query to return the ratings data in a more readable format: 
reviewer name, movie title, stars, and ratingDate. 
Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. */

select name, title, stars, ratingDate
from rating r
join reviewer re 
on re.rid = r.rid
join movie m
on r.mid = m.mid
order by name, title, stars
;

/* Q6 For all cases where the same reviewer rated the same movie twice 
and gave it a higher rating the second time, 
return the reviewer's name and the title of the movie. */

select name, title 
from Reviewer, Movie, Rating, Rating r2
where Rating.mID=Movie.mID and Reviewer.rID=Rating.rID and Rating.rID = r2.rID and r2.mID = Movie.mID and Rating.stars < r2.stars and Rating.ratingDate < r2.ratingDate;
group by name, title HAVING count(*) = 1;

select P.name, M.title from Rating R
join 
(
  select rID, mId 
  from Rating 
  group by rId, mID 
  having count(*) = 2
) as R2 on R2.mId = R.mId and R2.rID = R.rId
join reviewer P on P.rID = R.rID
join movie M on M.mID = R.mID
where exists (
  select 1 
  from Rating R3 
  where R3.rId = R.rID 
  and R3.mID = R.mId 
  and R3.ratingDate < R.ratingDate 
  and R3.stars < R.stars) 
;

/* Q7 For each movie that has at least one rating, find the highest number of stars that movie received. 
Return the movie title and number of stars. Sort by movie title. */

select m.title, max(r.stars)
from Movie m, Rating r
where r.mid = m.mid
group by m.title
order by m.title
;

/* Q8 For each movie, return the title and the 'rating spread', 
that is, the difference between highest and lowest ratings given to that movie. 
Sort by rating spread from highest to lowest, then by movie title. */

select title, max(stars)- min(stars)
as spread from Movie, Rating 
where Movie.mid = Rating.mid
group by title
order by spread desc
;

/* Q9 Find the difference between the average rating of movies released before 1980 
and the average rating of movies released after 1980. alter
(Make sure to calculate the average rating for each movie,
 then the average of those averages for movies before 1980 and movies after. 
 Don't just calculate the overall average rating before and after 1980.) */
 
select abs(avg(avgrating2) - avg(avgrating1)) as difference
from (
select title, avg(stars) as avgrating1
from rating r
join movie m
	on m.mid = r.mid
where year < 1980
group by title) as beforeeighties
join (
select title, avg(stars) as avgrating2
from rating r
join movie m
	on m.mid = r.mid
where year > 1980
group by title) as aftereighties;