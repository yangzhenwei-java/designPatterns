package action.state;

public class Context
{
    private IWeather weather;

    public void setWeather(IWeather weather)
    {
        this.weather = weather;
    }

    public IWeather getWeather()
    {
        return this.weather;
    }

    public String weatherMessage()
    {
        return weather.getWeather();
    }
}
