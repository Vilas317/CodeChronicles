import React, { useState } from 'react';
import { Play, Info, Bell, Search, ChevronDown } from 'lucide-react';
import Navbar from './components/Navbar';
import MovieRow from './components/MovieRow';
import Hero from './components/Hero';

function App() {
  return (
    <div className="min-h-screen bg-black text-white">
      <Navbar />
      <Hero />
      <div className="px-4 md:px-16 pb-24">
        <MovieRow title="Trending Now" category="trending" />
        <MovieRow title="Popular on Netflix" category="popular" />
        <MovieRow title="New Releases" category="new" />
        <MovieRow title="Watch Again" category="recommended" />
      </div>
    </div>
  );
}

export default App;