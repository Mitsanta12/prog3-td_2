CREATE TABLE match (
  id SERIAL PRIMARY KEY,
  date DATE NOT NULL,
  time TIME NOT NULL,
  stadium VARCHAR(255) NOT NULL,
  home_team_id INTEGER REFERENCES team(id),
  away_team_id INTEGER REFERENCES team(id)
);
