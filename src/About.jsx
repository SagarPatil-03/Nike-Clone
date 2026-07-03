import React from "react";
import "./about.scss";

const About = () => {
  return (
    <div className="about">
      <h1>About Nike Clone</h1>

      <p>
        Welcome to our Nike Clone website! This project is inspired by the
        official Nike website and is built using React.js and Vite.
      </p>

      <h2>Our Collections</h2>
      <ul>
        <li>👟 Men's Collection</li>
        <li>👩 Women's Collection</li>
        <li>🧒 Kids Collection</li>
        <li>🎒 Bags & Accessories</li>
        <li>👕 Clothing & Sportswear</li>
      </ul>

      <h2>Technologies Used</h2>
      <p>React.js • Vite • JavaScript • SCSS • HTML5</p>

      <h2>Our Mission</h2>
      <p>
        Our goal is to provide a clean, modern, and responsive shopping
        experience inspired by Nike. This website is created only for learning
        and portfolio purposes.
      </p>
       <h2>Disclaimer</h2>

        <p>
          This is a Nike-inspired educational project created only for learning
          and portfolio purposes. It is not an official Nike website.
        </p>
      
    </div>
  );
};

export default About;