package unit_test

import (
	"github.com/stretchr/testify/assert"
	"rice-cooker-go/pkg/service"
	"testing"
)

func TestPutIngredient(t *testing.T) {
	rcs := &service.RiceCookerService{}
	result := rcs.PutIngredient()

	assert.Equal(t, "You put ingredient in.", result)
}

func TestUnPlug(t *testing.T) {
	rcs := &service.RiceCookerService{}
	result := rcs.UnPlug()

	assert.Equal(t, "You unplugged the rice cooker.", result)
}
