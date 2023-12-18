require 'test/unit'
require_relative '../lib/rice_cooker_service'

class TestRiceCookerService < Test::Unit::TestCase
  def setup
    @rice_cooker = RiceCookerService.new(false ,false ,false )
  end

  def test_put_ingredient
    assert_equal('You put ingredient in.', @rice_cooker.put_ingredient)
    assert_equal(false, @rice_cooker.is_empty)
  end

  def test_unplug
    assert_equal('You unplugged the rice cooker.', @rice_cooker.unplug)
    assert_equal(false, @rice_cooker.is_plugged_in)
  end
end
