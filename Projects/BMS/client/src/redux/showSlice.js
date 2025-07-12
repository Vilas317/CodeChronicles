import { createSlice } from "@reduxjs/toolkit";

const showSlice = createSlice({
  name: "shows",
  initialState: { shows: [] },
  reducers: {
    SetShows: (state, action) => {
      state.shows = action.payload;
    }
  }
});

export const { SetShows } = showSlice.actions;
export default showSlice.reducer;
